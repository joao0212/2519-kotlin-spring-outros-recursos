INSERT INTO usuario (nome, email, password) VALUES ('admin', 'admin@email.com', '$2y$12$rnZ4zWxhPv.7iSOhBKkGqu2PVsJf./W78TScYJd.EWdaEeWhnhQW.');
INSERT INTO role (nome) VALUES ('ADMIN');
INSERT INTO usuario_role (usuario_id, role_id) VALUES (2, 2);