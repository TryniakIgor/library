CREATE TABLE IF NOT EXISTS users (
        id INTEGER PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(255) NOT NULL,
        user_name VARCHAR(255) NOT NULL UNIQUE,
        password VARCHAR(255) NOT NULL,
        age INTEGER NOT NULL);
CREATE TABLE IF NOT EXISTS articles (
        id INTEGER PRIMARY KEY AUTO_INCREMENT,
        text VARCHAR(255) NOT NULL,
        color VARCHAR(255) NOT NULL,
        user_id INTEGER,
        CONSTRAINT ARTICLE_USER
        FOREIGN KEY (user_id)
        REFERENCES users (id) );
CREATE TABLE IF NOT EXISTS roles (
        id INTEGER PRIMARY KEY AUTO_INCREMENT,
        name VARCHAR(255)
--         CONSTRAINT ROLE_USER
--         FOREIGN KEY (name )
--         REFERENCES users (user_name)
        );


