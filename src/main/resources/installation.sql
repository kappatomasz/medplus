CREATE USER IF NOT EXISTS ADMIN SALT '9aa4d3837de9ea28' HASH '61d66f02b03aaf16d09ce12a633ea6cf4581a6503fddcaf1497cd32e1a5f93d2' ADMIN;

INSERT INTO PUBLIC.STATES(NAME) VALUES
(''),
(STRINGDECODE('dolno\u015bl\u0105skie')),
('kujawsko-pomorskie'),
('lubelskie'),
('lubuskie'),
(STRINGDECODE('\u0142\u00f3dzkie')),
(STRINGDECODE('ma\u0142opolskie')),
('mazowieckie'),
('opolskie'),
('podlaskie'),
('podkarpackie'),
('pomorskie'),
(STRINGDECODE('\u015bl\u0105skie')),
(STRINGDECODE('\u015bwi\u0119tokrzyskie')),
(STRINGDECODE('warmi\u0144sko-mazurskie')),
('wielkopolskie'),
('zachodnio-pomorskie');
