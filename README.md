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
```

## Descripción

- **Cuenta**: Clase base que define las operaciones bancarias básicas (consignaciones, retiros, cálculo de intereses)
- **CuentaAhorros**: Hereda de Cuenta con validación de saldo mínimo de 10,000
- **CuentaCorriente**: Hereda de Cuenta con soporte para sobregiro
