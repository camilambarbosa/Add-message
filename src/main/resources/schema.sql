/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  camilabarbosa
 * Created: Dec. 15, 2021
 */

CREATE TABLE greetings(
id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
name varchar(30) NOT NULL,
message varchar(200) NOT NULL);

INSERT INTO greetings (name, message)
VALUES ( 'Amy', ' Congratulations');

INSERT INTO greetings (name, message)
VALUES ('Bob', ' Happy for you!');

INSERT INTO greetings (name, message)
VALUES ('Cindy', ' Yes');

