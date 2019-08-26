USE adlister_db;

TRUNCATE ads;
TRUNCATE users;

INSERT INTO users (username, email, password) VALUES ('user1', 'creativemail@email.com', 'password');

INSERT INTO ads (user_id, title, description) VALUES (1, 'Creative Title', 'Look at this awesome, lightly used item!')