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
    
    note right of Cuenta : Clase base para todas las cuentas bancarias
    note right of CuentaAhorros : Requiere saldo mínimo de 10,000 para estar activa
    note right of CuentaCorriente : Permite girar más allá del saldo hasta el límite de sobregiro
```
