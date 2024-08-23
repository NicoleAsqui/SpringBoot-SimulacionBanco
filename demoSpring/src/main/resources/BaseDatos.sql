CREATE TABLE Persona (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         nombre VARCHAR(255),
                         genero VARCHAR(50),
                         edad INT,
                         identificacion VARCHAR(255),
                         direccion VARCHAR(255),
                         telefono VARCHAR(50)
);

CREATE TABLE Cliente (
                         id BIGINT PRIMARY KEY,
                         contrasena VARCHAR(255),
                         estado BOOLEAN,
                         FOREIGN KEY (id) REFERENCES Persona(id)
);

CREATE TABLE Cuenta (
                        numeroCuenta BIGINT AUTO_INCREMENT PRIMARY KEY,
                        tipoCuenta VARCHAR(50),
                        saldoInicial DECIMAL(10,2),
                        estado BOOLEAN,
                        cliente_id BIGINT,
                        FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
);

CREATE TABLE Movimiento (
                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                            fecha DATE,
                            tipoMovimiento VARCHAR(50),
                            valor DECIMAL(10,2),
                            saldo DECIMAL(10,2),
                            numeroCuenta BIGINT,
                            FOREIGN KEY (numeroCuenta) REFERENCES Cuenta(numeroCuenta)
);
