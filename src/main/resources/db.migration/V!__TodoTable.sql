CREATE TABLE todo(
    id UUID NOT NULL PRIMARY KEY,
    body VARCHAR(1000),
    title VARCHAR(100),
    userId UUID,
    modified TIMESTAMP,
    categoryId UUID,
    tags UUID ARRAY,
    createdAt TIMESTAMP
)