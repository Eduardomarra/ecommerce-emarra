-- Categorias
INSERT INTO categorias (nome) VALUES ('Periféricos');
INSERT INTO categorias (nome) VALUES ('Componentes');
INSERT INTO categorias (nome) VALUES ('Notebooks');
INSERT INTO categorias (nome) VALUES ('Monitores');
INSERT INTO categorias (nome) VALUES ('Redes');

-- Fornecedores
INSERT INTO fornecedores (nome, cnpj, email, telefone) VALUES ('InfoTech Ltda', '12345678000100', 'contato@infotech.com', '(11) 3123-4567');
INSERT INTO fornecedores (nome, cnpj, email, telefone) VALUES ('Hardware BR', '22345678000100', 'suporte@hardwarebr.com', '(21) 99876-4321');
INSERT INTO fornecedores (nome, cnpj, email, telefone) VALUES ('Digital Center', '32345678000100', 'digital@center.com', '(31) 4002-8922');
INSERT INTO fornecedores (nome, cnpj, email, telefone) VALUES ('RedeMais', '42345678000100', 'vendas@redemais.com', '(41) 3232-2020');
INSERT INTO fornecedores (nome, cnpj, email, telefone) VALUES ('AlphaBits', '52345678000100', 'contato@alphabits.com', '(51) 98765-1234');

-- Clientes
INSERT INTO clientes (nome, email, telefone, cpf_cnpj, endereco) VALUES ('João Silva', 'joao@gmail.com', '61988889999', '12345678901', 'Rua A, Brasília');
INSERT INTO clientes (nome, email, telefone, cpf_cnpj, endereco) VALUES ('Maria Souza', 'maria@gmail.com', '61988889998', '12345678902', 'Rua B, Brasília');
INSERT INTO clientes (nome, email, telefone, cpf_cnpj, endereco) VALUES ('Carlos Lima', 'carlos@gmail.com', '61988889997', '12345678903', 'Rua C, Brasília');
INSERT INTO clientes (nome, email, telefone, cpf_cnpj, endereco) VALUES ('Ana Rocha', 'ana@gmail.com', '61988889996', '12345678904', 'Rua D, Brasília');
INSERT INTO clientes (nome, email, telefone, cpf_cnpj, endereco) VALUES ('Pedro Santos', 'pedro@gmail.com', '61988889995', '12345678905', 'Rua E, Brasília');
INSERT INTO clientes (nome, email, telefone, cpf_cnpj, endereco) VALUES ('Lucas Mendes', 'lucas@gmail.com', '61988889994', '12345678906', 'Rua F, Brasília');
INSERT INTO clientes (nome, email, telefone, cpf_cnpj, endereco) VALUES ('Fernanda Dias', 'fernanda@gmail.com', '61988889993', '12345678907', 'Rua G, Brasília');
INSERT INTO clientes (nome, email, telefone, cpf_cnpj, endereco) VALUES ('Bruna Nunes', 'bruna@gmail.com', '61988889992', '12345678908', 'Rua H, Brasília');
INSERT INTO clientes (nome, email, telefone, cpf_cnpj, endereco) VALUES ('Tiago Moreira', 'tiago@gmail.com', '61988889991', '12345678909', 'Rua I, Brasília');
INSERT INTO clientes (nome, email, telefone, cpf_cnpj, endereco) VALUES ('Larissa Gomes', 'larissa@gmail.com', '61988889990', '12345678910', 'Rua J, Brasília');

-- Produtos
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Mouse Gamer', 'Mouse com LED RGB', 120.00, TRUE, 1, 1);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Teclado Mecânico', 'Teclado com switches azuis', 250.00, TRUE, 1, 2);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('SSD 480GB', 'SSD rápido SATA 3', 280.00, TRUE, 2, 2);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Placa Mãe Intel', 'Compatível com 10ª geração', 780.00, TRUE, 2, 3);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Notebook i5', '8GB RAM, 256GB SSD', 3200.00, TRUE, 3, 1);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Notebook i7', '16GB RAM, 512GB SSD', 4600.00, TRUE, 3, 1);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Monitor 24"', 'Full HD HDMI', 850.00, TRUE, 4, 3);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Monitor 27"', '2K resolução', 1450.00, TRUE, 4, 4);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Roteador AC1200', 'Dual Band 5Ghz', 230.00, TRUE, 5, 5);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Switch 8 portas', 'Gigabit Ethernet', 280.00, TRUE, 5, 5);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('HD Externo 1TB', 'USB 3.0', 320.00, TRUE, 2, 2);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Gabinete ATX', 'Com vidro temperado', 340.00, TRUE, 2, 1);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Fonte 600W', '80 Plus Bronze', 420.00, TRUE, 2, 2);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Memória RAM 8GB', 'DDR4 2666MHz', 250.00, TRUE, 2, 3);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Cabo HDMI 2m', 'Alta velocidade', 40.00, TRUE, 1, 4);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Cooler para CPU', '120mm silencioso', 120.00, TRUE, 2, 2);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Hub USB', '4 portas', 80.00, TRUE, 1, 5);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Webcam Full HD', '1080p com microfone', 220.00, TRUE, 1, 3);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Mousepad Gamer', 'Extra grande', 90.00, TRUE, 1, 4);
INSERT INTO produtos (nome, descricao, preco, ativo, categoria_id, fornecedor_id) VALUES ('Adaptador Wi-Fi USB', 'Dual Band', 70.00, TRUE, 5, 5);

-- Estoque
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES  (1, 50, '2025-06-01 10:00:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (2, 30, '2025-06-01 10:05:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (3, 20, '2025-06-01 10:10:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (4, 10, '2025-06-01 10:15:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES  (5, 15, '2025-06-01 10:20:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (6, 10, '2025-06-01 10:25:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (7, 25, '2025-06-01 10:30:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES  (8, 12, '2025-06-01 10:35:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES  (9, 40, '2025-06-01 10:40:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (10, 35, '2025-06-01 10:45:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES  (11, 20, '2025-06-01 10:50:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES  (12, 18, '2025-06-01 10:55:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (13, 22, '2025-06-01 11:00:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (14, 16, '2025-06-01 11:05:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES  (15, 60, '2025-06-01 11:10:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (16, 14, '2025-06-01 11:15:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (17, 50, '2025-06-01 11:20:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (18, 28, '2025-06-01 11:25:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (19, 45, '2025-06-01 11:30:00');
INSERT INTO estoque (produto_id, quantidade, data_ultima_atualizacao) VALUES (20, 33, '2025-06-01 11:35:00');

-- Formas de Pagamento
INSERT INTO forma_pagamento (nome) VALUES ('Cartão de Crédito');
INSERT INTO forma_pagamento (nome) VALUES ('Cartão de débito');
INSERT INTO forma_pagamento (nome) VALUES ('Boleto');
INSERT INTO forma_pagamento (nome) VALUES ('PIX');
INSERT INTO forma_pagamento (nome) VALUES ('Transferência');
INSERT INTO forma_pagamento (nome) VALUES ('Dinheiro');

INSERT INTO pedidos (cliente_id, data_pedido, status_pedido, pagamento_id) VALUES (1, '2025-06-01 09:00:00', 'PAGO', 1);
INSERT INTO pedidos (cliente_id, data_pedido, status_pedido, pagamento_id) VALUES  (2, '2025-06-01 09:15:00', 'PAGO', 3);
INSERT INTO pedidos (cliente_id, data_pedido, status_pedido, pagamento_id) VALUES  (3, '2025-06-01 09:30:00', 'PENDENTE_PAGAMENTO', 2);
INSERT INTO pedidos (cliente_id, data_pedido, status_pedido, pagamento_id) VALUES  (4, '2025-06-01 09:45:00', 'PAGO', 1);
INSERT INTO pedidos (cliente_id, data_pedido, status_pedido, pagamento_id) VALUES  (5, '2025-06-01 10:00:00', 'PENDENTE_PAGAMENTO', 5);
INSERT INTO pedidos (cliente_id, data_pedido, status_pedido, pagamento_id) VALUES  (6, '2025-06-01 10:15:00', 'ENVIADO', 1);
INSERT INTO pedidos (cliente_id, data_pedido, status_pedido, pagamento_id) VALUES  (7, '2025-06-01 10:30:00', 'PAGO', 3);
INSERT INTO pedidos (cliente_id, data_pedido, status_pedido, pagamento_id) VALUES  (8, '2025-06-01 10:45:00', 'CANCELADO', 4);
INSERT INTO pedidos (cliente_id, data_pedido, status_pedido, pagamento_id) VALUES  (9, '2025-06-01 11:00:00', 'PAGO', 1);
INSERT INTO pedidos (cliente_id, data_pedido, status_pedido, pagamento_id) VALUES  (10, '2025-06-01 11:15:00', 'PAGO', 2);


INSERT INTO usuarios (nome, email, senha, perfil) VALUES ('Admin', 'admin@loja.com', '123456', 'ADM');
INSERT INTO usuarios (nome, email, senha, perfil) VALUES ('Vendedor 1', 'vend1@loja.com', 'abc123', 'USER');
INSERT INTO usuarios (nome, email, senha, perfil) VALUES ('Vendedor 2', 'vend2@loja.com', 'abc123', 'USER');
INSERT INTO usuarios (nome, email, senha, perfil) VALUES ('Estoque', 'estoque@loja.com', 'abc123', 'USER');
