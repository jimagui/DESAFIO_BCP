DROP TABLE IF EXISTS TBL_TIPO_CAMBIO;
DROP TABLE IF EXISTS TBL_MONEDA;

CREATE TABLE TBL_MONEDA(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  codigo  CHAR(3) NOT NULL,
  numero  CHAR(3) NOT NULL,
  divisa  VARCHAR(250) NOT NULL
);
  
CREATE TABLE TBL_TIPO_CAMBIO(
  id INT AUTO_INCREMENT  PRIMARY KEY,
  tipoCambio    NUMBER(12,4) NOT NULL,
  codigoOrigen  CHAR(3) NOT NULL,
  codigoDestino CHAR(3) NOT NULL
);

INSERT INTO TBL_MONEDA (codigo, numero, divisa) VALUES
						  ('PEN', '604',  'Sol'),
						  ('USD', '840',  'Dolar estadounidense'),
						  ('MXN', '484',  'Peso mexicano'),
						  ('EUR', '978',  'Euro');
INSERT INTO TBL_TIPO_CAMBIO (tipoCambio, codigoOrigen, codigoDestino) VALUES
						  (3.3, 'USD' , 'PEN'),
						  (3.4, 'EUR' , 'PEN'),
						  (0.9, 'MXN' , 'PEN');