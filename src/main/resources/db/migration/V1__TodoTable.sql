CREATE TABLE todo(
    id UUID NOT NULL PRIMARY KEY,
    body VARCHAR(1000) NOT NULL,
    title VARCHAR(100),
    userId UUID,
    modified BIGINT,
    categoryId UUID,
    tags UUID ARRAY,
    createdAt BIGINT
)