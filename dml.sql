INSERT INTO concesionario.cliente (nif, nombre, direccion, ciudad, telefono, categoria)
VALUES
  ('12345678A', 'Juan Lopez', 'Calle Gran Vía, 123', 'Madrid', '123456789', 'Oro'),
  ('98765432B', 'Pedro Gonzalez', 'Calle Arganda, 20', 'Madrid', '987654321', 'Plata');
  
INSERT INTO concesionarios.empleado (ID, NOMBRE, DIRECCION, EMAIL, TELEFONO, SUELDO, COMISION) VALUES 
  (1, 'JUAN', 'CALLE GRAN VÍA, 51', 'juan@gmail.com', '916543876', 18000, 0.5),  (2, 'MARIA', 'CALLE ATOCHA, 13', 'maria@gmail.com', '643397543', 19000, 0.2);

INSERT INTO `coche` (`matricula`, `marca`, `modelo`, `color`, `precio`, `estado`, `anyo`)
VALUES
  ('ABC1234', 'Toyota', 'Camry', 'Rojo', 25000.50, 1, 2022),
  ('XYZ5678', 'Honda', 'Civic', 'Azul', 22000.75, 1, 2021),
  ('DEF9876', 'Ford', 'Mondeo', 'Negro', 20000.00, 0, 2020);