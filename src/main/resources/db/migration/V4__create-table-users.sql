CREATE TABLE users (
    id text primary key unique not null,
    login text not null unique,
    password text not null,
    role TEXT NOT NULL
);