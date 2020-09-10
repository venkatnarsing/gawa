DROP TABLE IF EXISTS owner;

CREATE TABLE owner (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  phone_number VARCHAR(20) DEFAULT NULL,
  house_number VARCHAR(10) DEFAULT NULL
);

INSERT INTO owner (first_name, last_name, phone_number, house_number) VALUES
  ('Kiran', 'Ch', '1234567890', '9-3-1'),
  ('Jaggaiah', 'Jaggaiah', '1234567890', '9-3-2'),
  ('Uday', 'Uday', '1234567890', '9-3-3'),
  ('Babukhan', 'Babukhan', '1234567890', '9-3-4');