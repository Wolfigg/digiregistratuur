-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2022-02-15 09:04:39.515

-- tables
-- Table: disease
CREATE TABLE disease (
    id serial  NOT NULL,
    name varchar(50)  NOT NULL,
    description varchar(255)  NOT NULL,
    CONSTRAINT disease_pk PRIMARY KEY (id)
);

-- Table: patient
CREATE TABLE patient (
    id serial  NOT NULL,
    id_code varchar(11)  NOT NULL,
    CONSTRAINT patient_pk PRIMARY KEY (id)
);

-- Table: patient_contact_info
CREATE TABLE patient_contact_info (
    id serial  NOT NULL,
    patient_id int  NOT NULL,
    first_name varchar(50)  NOT NULL,
    last_name varchar(50)  NOT NULL,
    email varchar(50)  NOT NULL,
    mobile varchar(50)  NOT NULL,
    address varchar(50)  NOT NULL,
    CONSTRAINT patient_contact_info_pk PRIMARY KEY (id)
);

-- Table: patient_disease
CREATE TABLE patient_disease (
    id serial  NOT NULL,
    patient_id int  NOT NULL,
    disease_id int  NOT NULL,
    CONSTRAINT patient_disease_pk PRIMARY KEY (id)
);

-- Table: questionaire
CREATE TABLE questionaire (
    id serial  NOT NULL,
    date date  NOT NULL,
    patient_id int  NOT NULL,
    disease_id int  NOT NULL,
    status varchar  NOT NULL,
    CONSTRAINT questionaire_pk PRIMARY KEY (id)
);

-- Table: questionaire_answer
CREATE TABLE questionaire_answer (
    id serial  NOT NULL,
    yes boolean  NULL,
    questionaire_id int  NOT NULL,
    questionaire_question_id int  NOT NULL,
    CONSTRAINT questionaire_answer_pk PRIMARY KEY (id)
);

-- Table: questionaire_question
CREATE TABLE questionaire_question (
    id serial  NOT NULL,
    disease_id int  NOT NULL,
    question varchar(255)  NOT NULL,
    CONSTRAINT questionaire_question_pk PRIMARY KEY (id)
);

-- Table: questionaire_result
CREATE TABLE questionaire_result (
    id serial  NOT NULL,
    questionaire_id int  NOT NULL,
    positive boolean  NOT NULL,
    comments varchar  NULL,
    CONSTRAINT questionaire_result_pk PRIMARY KEY (id)
);

-- foreign keys
-- Reference: patient_contact_info_patient (table: patient_contact_info)
ALTER TABLE patient_contact_info ADD CONSTRAINT patient_contact_info_patient
    FOREIGN KEY (patient_id)
    REFERENCES patient (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: patient_disease_disease (table: patient_disease)
ALTER TABLE patient_disease ADD CONSTRAINT patient_disease_disease
    FOREIGN KEY (disease_id)
    REFERENCES disease (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: patient_disease_patient (table: patient_disease)
ALTER TABLE patient_disease ADD CONSTRAINT patient_disease_patient
    FOREIGN KEY (patient_id)
    REFERENCES patient (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: questionaire_answer_questionaire (table: questionaire_answer)
ALTER TABLE questionaire_answer ADD CONSTRAINT questionaire_answer_questionaire
    FOREIGN KEY (questionaire_id)
    REFERENCES questionaire (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: questionaire_answer_questionaire_question (table: questionaire_answer)
ALTER TABLE questionaire_answer ADD CONSTRAINT questionaire_answer_questionaire_question
    FOREIGN KEY (questionaire_question_id)
    REFERENCES questionaire_question (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: questionaire_disease (table: questionaire)
ALTER TABLE questionaire ADD CONSTRAINT questionaire_disease
    FOREIGN KEY (disease_id)
    REFERENCES disease (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: questionaire_patient (table: questionaire)
ALTER TABLE questionaire ADD CONSTRAINT questionaire_patient
    FOREIGN KEY (patient_id)
    REFERENCES patient (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: questionaire_question_disease (table: questionaire_question)
ALTER TABLE questionaire_question ADD CONSTRAINT questionaire_question_disease
    FOREIGN KEY (disease_id)
    REFERENCES disease (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: test_result_questionaire (table: questionaire_result)
ALTER TABLE questionaire_result ADD CONSTRAINT test_result_questionaire
    FOREIGN KEY (questionaire_id)
    REFERENCES questionaire (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

