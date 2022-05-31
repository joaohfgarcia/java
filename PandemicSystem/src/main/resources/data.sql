INSERT INTO HOSPITAL (id, nome, cnpj, endereco, fone, taxa_ocupacao)
VALUES (1, 'Hospital de Trauma', '96.440.565/0001-69', 'Rua Dácio Avelino Rodrigues, 63', '(83) 3030-9999', 95.20),
       (2, 'Hospital N.Sra das Neves', '82.618.519/0001-00', 'Rua Sabino Viana, 10', '(83) 3030-9999', 45.80),
       (3, 'Hospital São Francisco', '86.016.269/0001-81', 'Rua Daniel Luiz Rodrigues, 321', '(83) 3030-9999', 68.35);

INSERT INTO RECURSO (id, nome, pontuacao, estoque, idhospital)
VALUES (1, 'Médico', 3, 10, 1),
       (2, 'Enfermeiro', 3, 30, 1),
       (3, 'Respirador', 5, 23, 1),
       (4, 'Tomógrafo', 12, 12, 1),
       (5, 'Ambulância', 10, 5, 1),
       (6, 'Médico', 3, 12, 2),
       (7, 'Enfermeiro', 3, 20, 2),
       (8, 'Respirador', 5, 15, 2),
       (9, 'Tomógrafo', 12, 8, 2),
       (10, 'Ambulância', 10, 3, 2),
       (11, 'Médico', 3, 24, 3),
       (12, 'Enfermeiro', 3, 36, 3),
       (13, 'Respirador', 5, 21, 3),
       (14, 'Tomógrafo', 12, 18, 3),
       (15, 'Ambulância', 10, 7, 3);