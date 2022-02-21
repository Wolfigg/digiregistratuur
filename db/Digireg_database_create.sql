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

-- Table: questionary
CREATE TABLE questionary (
    id serial  NOT NULL,
    date date  NOT NULL,
    patient_id int  NOT NULL,
    disease_id int  NOT NULL,
    status varchar(255)  NOT NULL,
    CONSTRAINT questionary_pk PRIMARY KEY (id)
);

-- Table: questionary_answer
CREATE TABLE questionary_answer (
    id serial  NOT NULL,
    yes boolean  NULL,
    questionary_id int  NOT NULL,
    questionary_question_id int  NOT NULL,
    CONSTRAINT questionary_answer_pk PRIMARY KEY (id)
);

-- Table: questionary_question
CREATE TABLE questionary_question (
    id serial  NOT NULL,
    disease_id int  NOT NULL,
    question varchar(255)  NOT NULL,
    CONSTRAINT questionary_question_pk PRIMARY KEY (id)
);

-- Table: questionary_result
CREATE TABLE questionary_result (
    id serial  NOT NULL,
    questionary_id int  NOT NULL,
    positive boolean  NOT NULL,
    comments varchar(255)  NULL,
    CONSTRAINT questionary_result_pk PRIMARY KEY (id)
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

-- Reference: questionary_answer_questionary (table: questionary_answer)
ALTER TABLE questionary_answer ADD CONSTRAINT questionary_answer_questionary
    FOREIGN KEY (questionary_id)
    REFERENCES questionary (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: questionary_answer_questionary_question (table: questionary_answer)
ALTER TABLE questionary_answer ADD CONSTRAINT questionary_answer_questionary_question
    FOREIGN KEY (questionary_question_id)
    REFERENCES questionary_question (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: questionary_disease (table: questionary)
ALTER TABLE questionary ADD CONSTRAINT questionary_disease
    FOREIGN KEY (disease_id)
    REFERENCES disease (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: questionary_patient (table: questionary)
ALTER TABLE questionary ADD CONSTRAINT questionary_patient
    FOREIGN KEY (patient_id)
    REFERENCES patient (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: questionary_question_disease (table: questionary_question)
ALTER TABLE questionary_question ADD CONSTRAINT questionary_question_disease
    FOREIGN KEY (disease_id)
    REFERENCES disease (id)  
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- Reference: test_result_questionary (table: questionary_result)
ALTER TABLE questionary_result ADD CONSTRAINT test_result_questionary
    FOREIGN KEY (questionary_id)
    REFERENCES questionary (id)
    NOT DEFERRABLE 
    INITIALLY IMMEDIATE
;

-- End of file.

