CREATE TABLE llibre(
    llibre_ID INT PRIMARY KEY,
    titol VARCHAR (40),
    anyPublicació DATE,
    autorId INT,
    FOREIGN KEY (autorId) REFERENCES Autor(autorId),
);

CREATE TABLE Autor(
    ID INT PRIMARY KEY,
    nom VARCHAR (40),
    cognom VARCHAR (40),
);

    