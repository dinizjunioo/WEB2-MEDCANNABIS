-- Inserindo registros na tabela Paciente
insert into paciente (nome, data_nasc, endereco, telefone, data_admissao) 
values ('Fulano', '1990-01-01', 'Rua A', '123456789', '2024-01-01');

insert into paciente (nome, data_nasc, endereco, telefone, data_admissao) 
values ('Ciclano', '1985-05-10', 'Rua B', '987654321', '2023-12-15');

insert into paciente (nome, data_nasc, endereco, telefone, data_admissao) 
values ('Beltrano', '1995-11-20', 'Rua C', '555555555', '2022-06-30');

select * from paciente;