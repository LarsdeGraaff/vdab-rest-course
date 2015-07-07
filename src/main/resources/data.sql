INSERT INTO merk (id,merk , adres) VALUES (1, 'Audi', 'Bahnhoff 316, Gehsfinkstermunch');
INSERT INTO merk (id,merk ,adres) VALUES (2, 'Honda', 'Chew Di Ho 24, Kai Uhn');
INSERT INTO merk (id,merk ,adres) VALUES (3, 'Renault', 'Avenue de la Bastille 2, Lion');
INSERT INTO merk (id,merk ,adres) VALUES (4, 'Kia', 'Tai Ki Priw 11, Khao Reap');
INSERT INTO merk (id,merk ,adres) VALUES (5, 'Ford', 'Central Avenue 81');


INSERT INTO model (id, model, merk_id) VALUES (1, 'A3', 1);
INSERT INTO model (id, model, merk_id) VALUES (2, 'R8', 1);
INSERT INTO model (id, model, merk_id) VALUES (3, 'Q8', 1);
INSERT INTO model (id, model, merk_id) VALUES (4, 'Accord', 2);
INSERT INTO model (id, model, merk_id) VALUES (5, 'Legend', 2);
INSERT INTO model (id, model, merk_id) VALUES (6, 'Civic', 2);
INSERT INTO model (id, model, merk_id) VALUES (7, 'Accent', 2);

INSERT INTO model (id, model, merk_id) VALUES (8, 'Megane', 3);
INSERT INTO model (id, model, merk_id) VALUES (9, 'Clio', 3);
INSERT INTO model (id, model, merk_id) VALUES (10, 'Kangoo', 3);
INSERT INTO model (id, model, merk_id) VALUES (11, 'Espace', 3);

INSERT INTO model (id, model, merk_id) VALUES (12, 'Optima', 4);
INSERT INTO model (id, model, merk_id) VALUES (13, 'Rio', 4);
INSERT INTO model (id, model, merk_id) VALUES (14, 'Sportage', 4);

INSERT INTO model (id, model, merk_id) VALUES (15, 'Focus', 5);
INSERT INTO model (id, model, merk_id) VALUES (16, 'Fiesta', 5);
INSERT INTO model (id, model, merk_id) VALUES (17, 'Mustang', 5);
INSERT INTO model (id, model, merk_id) VALUES (18, 'Mondeo', 5);
INSERT INTO model (id, model, merk_id) VALUES (19, 'Transit', 5);


INSERT INTO cars (id, model_id, nummer_plaat) VALUES (1, 1, '1-JFG 478');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (2, 2, '1-LFJ 545' );
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (3, 3, '135 JHL');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (4, 4, '1- RTJ 153');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (5, 5, '535 GDK');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (6, 6, '654 IUJ');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (7, 7, '1-YEK 585' );
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (8, 8, '1-LGF 742');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (9, 9, '322 BHE');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (10, 10, '1-TRD 651');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (11, 11, '984 CRT' );
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (12, 12, '1-POJ 189');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (13, 13, '351 YTF' );
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (14, 14, '1-XPH 347');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (15, 15, '124 OUY' );
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (16, 16, '1-RRE 776');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (17, 17, '1-HUG 489');
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (18, 18, '493 OIF' );
INSERT INTO cars (id, model_id, nummer_plaat) VALUES (19, 19, '1-MEC 873');