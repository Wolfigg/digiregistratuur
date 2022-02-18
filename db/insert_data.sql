INSERT INTO public.patient (id, id_code) VALUES (DEFAULT, '3001');
INSERT INTO public.patient (id, id_code) VALUES (DEFAULT, '3002');
INSERT INTO public.patient (id, id_code) VALUES (DEFAULT, '4001');
INSERT INTO public.patient (id, id_code) VALUES (DEFAULT, '4002');

INSERT INTO public.patient_contact_info (id, patient_id, first_name, last_name, email, mobile, address) VALUES (DEFAULT, 1, 'Mart', 'Tamm', 'mart.tamm@mail.ee', '56930793', 'Tamme 3');
INSERT INTO public.patient_contact_info (id, patient_id, first_name, last_name, email, mobile, address) VALUES (DEFAULT, 2, 'Karl', 'Tamm', 'karl.tamm@mail.ee', '56930003', 'Tamme 3');
INSERT INTO public.patient_contact_info (id, patient_id, first_name, last_name, email, mobile, address) VALUES (DEFAULT, 3, 'Mari', 'Tamm', 'mart.tamm@mail.ee', '56948001', 'Tamme 3');
INSERT INTO public.patient_contact_info (id, patient_id, first_name, last_name, email, mobile, address) VALUES (DEFAULT, 4, 'Anni', 'Kask', 'mart.tamm@mail.ee', '56930793', 'Kase 3');

INSERT INTO public.disease (id, name, description) VALUES (DEFAULT, 'covid-19', 'COVID-19 on ägeda raskekujulise respiratoorse sündroomiga nakkushaigus. Enamikul juhtudest kulgeb haigus kergemate külmetushaigusele iseloomulike sümptomitega, kuid viirus võib põhjustada ka hingamisraskuseid ja kopsupõletikku.');
INSERT INTO public.disease (id, name, description) VALUES (DEFAULT, 'gripp', 'Gripp on äge viiruslik haigus. Gripp levib puhangute, epideemia ja pandeemiana. Kõige enam haigestuvad grippi lapsed, kuid hospitaliseerimised ja surmajuhud tekivad peamiselt  eakate, krooniliste haigustega inimeste hulgas.');
INSERT INTO public.disease (id, name, description) VALUES (DEFAULT, 'aids', 'Omandatud immuunpuudulikkuse sündroom (AIDS) muutus arstide ja teadlaste huviobjektiks 1981. aastal Ameerika Ühendriikides, mil esmakordselt diagnoositi inimestel raku-immuunsuse puudulikkusega kulgev haigus.');

INSERT INTO public.patient_disease (id, patient_id, disease_id) VALUES (DEFAULT, 1, 1);

INSERT INTO public.questionaire (id, date, patient_id, disease_id, status) VALUES (DEFAULT, '2022-02-15', 1, 1, 'pending');

INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 1, 'palavik');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 1, 'köha');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 1, 'peavalu');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 1, 'kõhulahtisus');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 2, 'palavik');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 2, 'väsimus');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 2, 'nohu');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 2, 'oksendamine');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 3, 'palavik');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 3, 'suurenenud lümfisõlmed');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 3, 'lööve');
INSERT INTO public.questionaire_question (id, disease_id, question) VALUES (DEFAULT, 3, 'väsimus');

INSERT INTO public.questionaire_answer (id, yes, questionaire_id, questionaire_question_id) VALUES (DEFAULT, true, 2, 1);
INSERT INTO public.questionaire_answer (id, yes, questionaire_id, questionaire_question_id) VALUES (DEFAULT, true, 2, 2);
INSERT INTO public.questionaire_answer (id, yes, questionaire_id, questionaire_question_id) VALUES (DEFAULT, true, 2, 3);

INSERT INTO public.questionaire_result (id, questionaire_id, positive, comments) VALUES (DEFAULT, 2, true, 'võta ühendust perearstiga');