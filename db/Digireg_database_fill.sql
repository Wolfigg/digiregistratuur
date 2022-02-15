INSERT INTO public.patient (id, id_code) VALUES (DEFAULT, '3001');
INSERT INTO public.patient (id, id_code) VALUES (DEFAULT, '3002');
INSERT INTO public.patient (id, id_code) VALUES (DEFAULT, '4001');
INSERT INTO public.patient (id, id_code) VALUES (DEFAULT, '4002');

INSERT INTO public.patient_contact_info (id, patient_id, first_name, last_name, email, mobile, address) VALUES (DEFAULT, 1, 'Jaanus', 'Mutt', 'j.mutt@gmail.com', '56607103', 'Palu 43a');
INSERT INTO public.patient_contact_info (id, patient_id, first_name, last_name, email, mobile, address) VALUES (DEFAULT, 2, 'Mihkel', 'Kirsipuu', 'm.kirsipuu@gmail.com', '56890291', 'Nisu 5');
INSERT INTO public.patient_contact_info (id, patient_id, first_name, last_name, email, mobile, address) VALUES (DEFAULT, 3, 'Jaanika', 'Klaarika', 'j.klaarika@gmail.com', '59829381', 'Kaera 3');
INSERT INTO public.patient_contact_info (id, patient_id, first_name, last_name, email, mobile, address) VALUES (DEFAULT, 4, 'Kersti', 'Kull', 'k.kull@gmail.com', '57892913', 'Toru põik 33');

INSERT INTO public.disease (id, name, description) VALUES (DEFAULT, 'Koroona', 'Haigus võib kulgeda ilma haigustunnusteta, aga võib esineda ka raske kopsupõletik, riskirühma kuuluvate inimeste puhul võib haigus halvimal juhul lõppeda ka surmaga.');
INSERT INTO public.disease (id, name, description) VALUES (DEFAULT, 'Herpes', 'Herpes ehk ohatis (ladina keeles herpes) on peamiselt inimestel esinev naha- või limaskestade infektsioonhaigus, mida põhjustab Herpes simplex''i viirus (HSV).');
INSERT INTO public.disease (id, name, description) VALUES (DEFAULT, 'Diabeet', 'Diabeet ehk suhkurtõbi on krooniline haigus, millele on iseloomulik vere suhkrusisalduse pikaajaline püsimine normist kõrgemal tasemel ning häired süsivesiku-, rasva- ja valguainevahetuses.');

INSERT INTO public.questionaire (id, date, patient_id, disease_id, status) VALUES (DEFAULT, '2022-02-14', 2, 2, 'Completed');

INSERT INTO public.patient_disease (id, patient_id, disease_id) VALUES (DEFAULT, 2, 2);

INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 2, 'Kas olete olnud vahekorras viimase 3 kuu jooksul?');

INSERT INTO public.questionaire_answer (id, yes, questionaire_id, questionaire_question_id) VALUES (DEFAULT, true, 1, 1);

INSERT INTO public.questionaire_result (id, questionaire_id, positive, comments) VALUES (DEFAULT, 1, true, 'kommenteeritud');


