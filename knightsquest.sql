DROP DATABASE IF EXISTS knightsquest;

CREATE DATABASE knightsquest;

USE knightsquest; 
  
  CREATE TABLE character_type (
      character_type_id INT NOT NULL PRIMARY KEY,      
      character_type VARCHAR(10)
      )ENGINE=INNODB;
    
INSERT INTO character_type VALUES (
      0, "Human"),
      (1, "Elf"),
      (2, "half-elf"),
      (3, "Dwarf"), 
      (4, "Gnome"), 
      (5, "Halfling"), 
      (6, "half-orc"),
	  (7, "Goblin" );
    
CREATE TABLE character_class (
     character_class_id INT NOT NULL PRIMARY KEY,
     character_class VARCHAR(10)
      )ENGINE=INNODB; 

INSERT INTO character_class VALUES (
      0, "fighter"),
      (1, "wizard"),
      (2, "cleric");  
      
CREATE TABLE _character (
       character_id INT NOT NULL PRIMARY KEY,
       character_type_id INT NOT NULL,
       character_class_id INT NOT NULL,
       character_name VARCHAR(20) NOT NULL,
       sex VARCHAR(2),
       strength INT,
       weight_limit INT,
       charisma INT,
       constitution INT,
       alignment VARCHAR(20),
       active TINYINT(1) NOT NULL
      
    )ENGINE=INNODB; 
    
INSERT INTO _character VALUES (
      0, 5, 0, "Frodo Baggins", 'M', 10, 20, 7, 7, "Good", 1);
      
CREATE TABLE tote (    
     tote_id INT NOT NULL PRIMARY KEY,
     tote_type VARCHAR(20) NOT NULL,
     capacity INT,
     _value INT
 ) ENGINE=INNODB;
 
CREATE TABLE character_tote (
      tote_id INT NOT NULL,
      character_id INT NOT NULL,
      PRIMARY KEY (tote_id, character_id),
      FOREIGN KEY (tote_id) 
      REFERENCES tote (tote_id),
      FOREIGN KEY (character_id) 
      REFERENCES _character (character_id)
      )ENGINE=InnoDB;
 
INSERT INTO tote VALUES (
      0, "Small Bag", 10, 2),
     (1, "Large Bag", 20, 4);
     
INSERT INTO character_tote (tote_id, character_id) VALUES (1,  0);
  
CREATE TABLE money_type (
     money_type_id INT NOT NULL PRIMARY KEY,
     money_type VARCHAR(20) NOT NULL,
     _value INT NOT NULL
  )ENGINE=INNODB;  
  
  CREATE TABLE money (
     money_id INT NOT NULL,
     money_type_id INT,
     amount INT,
     total_value INT,
     PRIMARY KEY(money_id, money_type_id),
	 CONSTRAINT FK_money_type FOREIGN KEY (money_type_id) 
	 REFERENCES money_type (money_type_id)
  )ENGINE=INNODB; 
  
CREATE TABLE character_money (
      character_id INT NOT NULL,
      money_id INT NOT NULL,
      PRIMARY KEY (character_id, money_id),
      CONSTRAINT FK_character_money FOREIGN KEY (character_id) 
      REFERENCES _character (character_id),
      CONSTRAINT FK_money FOREIGN KEY (money_id) 
      REFERENCES money (money_id)
      )ENGINE=INNODB; 
  
 INSERT INTO money_type VALUES (
     0, "gold piece", 5),
     (1, "silver piece", 3),
     (2, "copper piece", 1);
  
INSERT INTO money VALUES (
     0, 0, 10, 50);
     
INSERT INTO character_money VALUE (
      0, 0);      
     
CREATE TABLE weapon_type (       
       weapon_type_id INT NOT NULL PRIMARY KEY,
       weapon_type VARCHAR(20) NOT NULL,
       _value INT,
       damage INT
     )ENGINE=INNODB;
     
CREATE TABLE weapon (
       weapon_id INT NOT NULL,
       weapon_type_id INT NOT NULL,
       weapon_name VARCHAR(20),
       _condition INT,
       damage_adj INT,
       _value INT,
       PRIMARY KEY (weapon_id, weapon_type_id),
	   CONSTRAINT FK_weaponType FOREIGN KEY (weapon_type_id) 
       REFERENCES weapon_type (weapon_type_id)
     )ENGINE=INNODB;
     
CREATE TABLE character_weapon (
       weapon_id INT NOT NULL,
       character_id INT NOT NULL,
       PRIMARY KEY (weapon_id, character_id),
	   FOREIGN KEY (weapon_id) 
       REFERENCES weapon (weapon_id),
       FOREIGN KEY (character_id) 
       REFERENCES _character (character_id)
      )ENGINE=INNODB; 
     
INSERT INTO weapon_type VALUES (
     0, "Dagger", 5, 2);
     
INSERT INTO weapon VALUES (
      0, 0, "Sting", 5, 0, 10);
      
INSERT INTO character_weapon VALUES (
      0, 0);
      
CREATE TABLE armor_type (
       armor_type_id INT NOT NULL PRIMARY KEY,
       armor_type VARCHAR(20) NOT NULL,
       _value INT,
       strength INT
     )ENGINE=INNODB;
       
CREATE TABLE armor (
	   armor_id INT NOT NULL,
       armor_type_id INT NOT NULL,
       _condition INT,
       _value INT,
        PRIMARY KEY (armor_id, armor_type_id),
	    CONSTRAINT FK_armorType FOREIGN KEY (armor_type_id) 
        REFERENCES armor_type (armor_type_id)
		)ENGINE=INNODB;
        
CREATE TABLE character_armor (
       armor_id INT NOT NULL,
       character_id INT NOT NULL,
	   PRIMARY KEY (armor_id, character_id),
	   FOREIGN KEY (armor_id) 
       REFERENCES armor (armor_id),
       FOREIGN KEY (character_id) 
       REFERENCES _character (character_id)
      )ENGINE=INNODB; 
    
INSERT INTO armor_type VALUES (
       0, "Mithril chainmail", 5, 10);
       
INSERT INTO armor VALUES (
        0, 0, 5, 1000);
        
CREATE TABLE person (
      person_id INT NOT NULL PRIMARY KEY,
	  player_name VARCHAR(20) NOT NULL,
      first_name VARCHAR(20) NOT NULL,
      last_name VARCHAR(20) NOT NULL,
      email VARCHAR(20),
      active tinyint(1) NOT NULL Default 1,
      _password VARCHAR(45) NOT NULL Default "password",
      date_created date
      )ENGINE=InnoDB;
      
CREATE TABLE character_person (
       person_id INT NOT NULL,
       character_id INT NOT NULL,
	   PRIMARY KEY (person_id, character_id),
	   FOREIGN KEY (person_id) 
       REFERENCES person (person_id),
       FOREIGN KEY (character_id) 
       REFERENCES _character (character_id)
      )ENGINE=INNODB; 
 
INSERT INTO person VALUES (
       0, "Altazar", "Ken", "Bingham", "kbingh64@gmail.com",
      1, "password1", "2020-6-16");
      
INSERT INTO character_person VALUES (
        0, 0);

INSERT INTO character_armor VALUES (
        0, 0);
        
CREATE TABLE role_type (
       role_type_id INT NOT NULL PRIMARY KEY,
       role_type VARCHAR(20) NOT NULL
       )ENGINE=INNODB;
       
CREATE TABLE role (
        role_id INT NOT NULL,
        role_type_id INT NOT NULL,
        revolk SMALLINT(1) NOT NULL default 0,
		PRIMARY KEY (role_id, role_type_id),
	    CONSTRAINT FK_roleType FOREIGN KEY (role_type_id) 
        REFERENCES armor_type (armor_type_id)
		)ENGINE=INNODB;
       
CREATE TABLE person_role (
       role_id INT NOT NULL,
       person_id INT NOT NULL,
	   PRIMARY KEY (role_id, person_id),
	   FOREIGN KEY (role_id) 
       REFERENCES role (role_id),
       FOREIGN KEY (person_id) 
       REFERENCES person (person_id)
      )ENGINE=INNODB; 
      
INSERT INTO role_type values (
      0, "ADMIN"),
      (1, "DUNGEON MASTER"),
      (2, "PLAYER"); 
      
INSERT INTO role values (
     0, 0, 0); 
      
