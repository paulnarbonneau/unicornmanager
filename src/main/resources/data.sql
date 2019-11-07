DROP TABLE IF EXISTS unicorn;
 
CREATE TABLE unicorn (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  nom VARCHAR(250) NOT NULL,
  couleur VARCHAR(250) NOT NULL,
  age int DEFAULT NULL
);
 
INSERT INTO unicorn VALUES
  (1, 'Licorne rose', 'rose',12),
  (2, 'Licorne rouge', 'rouge',16),
  (3, 'Licorne verte', 'vert',14);