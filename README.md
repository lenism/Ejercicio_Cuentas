# Sistema de Cuentas Bancarias

## Diagrama UML

```mermaid
classDiagram
    class Cuenta {
        #float saldo
        #int numeroConsignaciones
        #int retiros
        #float tasaanual
        #float comisionMensual
        ~Cuenta(float saldo, float tasaanual)
        +consignar(float valor): void
        +retirar(float valor): void
        +calcularinteres(): void
        +extractomensual(): void
        +imprimir(): void
    }
    
    class CuentaAhorros {
        -boolean activa
        +CuentaAhorros(float saldo, float tasaanual)
        +consignar(float valor): void
        +retirar(float valor): void
        +extractomensual(): void
        +imprimir(): void
    }
    
    class CuentaCorriente {
        -float sobregiro
        +CuentaCorriente(float saldo, float tasaanual, float sobregiro)
        +retirar(float valor): void
        +extractomensual(): void
        +imprimir(): void
    }
    
    Cuenta <|-- CuentaAhorros
    Cuenta <|-- CuentaCorriente
    
    note right of Cuenta : Clase base para todas las cuentas
    note right of CuentaAhorros : Requiere saldo m�nimo de 10,000
    note right of CuentaCorriente : Permite sobregiro limitado
```

## Descripci�n de Clases

- **Cuenta**: Clase base que define operaciones bancarias b�sicas
- **CuentaAhorros**: Subclase con validaci�n de saldo m�nimo de 10,000
- **CuentaCorriente**: Subclase que permite sobregiro hasta un l�mite establecido
