-- Insertar datos en Persona
INSERT INTO Persona (nombre, genero, edad, identificacion, direccion, telefono)
VALUES
    ('Jose Lema', 'Masculino', 30, '001', 'Otavalo sn y principal', '098254785'),
    ('Marianela Montalvo', 'Femenino', 28, '002', 'Amazonas y NNUU', '097548965'),
    ('Juan Osorio', 'Masculino', 35, '003', '13 junio y Equinoccial', '098874587');

-- Insertar datos en Cliente
INSERT INTO Cliente (contraseña, estado, id)
VALUES
    ('1234', TRUE, 1),
    ('5678', TRUE, 2),
    ('1245', TRUE, 3);

-- Insertar datos en Cuenta
INSERT INTO Cuenta (numeroCuenta, tipo, saldoInicial, estado, clienteid)
VALUES
    (478758, 'Ahorros', 2000, TRUE, 1),
    (225487, 'Corriente', 100, TRUE, 2),
    (585545, 'Corriente', 1000, TRUE, 1);

-- Insertar datos en Movimiento
INSERT INTO Movimiento (fecha, tipoMovimiento, valor, saldo, cuentaNumero)
VALUES
    ('2024-08-23', 'Retiro', -575, 1425, 478758),
    ('2024-08-23', 'Depósito', 600, 700, 225487),
    ('2024-08-23', 'Depósito', 150, 150, 495878),
    ('2024-08-23', 'Retiro', -540, 0, 496825);
