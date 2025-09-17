CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    firstname VARCHAR(250) NOT NULL,
    lastname VARCHAR(250) NOT NULL,
    age INTEGER CHECK (age >= 0)
);