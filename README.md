# Sistema de Cuentas Bancarias

## Diagrama UML

```mermaid
classDiagram
    class Cuenta {
        # saldo: float
        # numeroconsignaciones: int
        # retiros: int
        # tasaanual: float
        # comisionmensual: float
        -Cuenta(saldo: float, tasaanual: float)
        +consignar(valor: float) void
        +retirar(valor: float) void
        +calcularinteres() void
        +extractomensual() void
    }
    
    class CuentaAhorros {
        - activa: boolean
        +CuentaAhorros(saldo: float, tasaanual: float)
        +consignar(valor: float) void*
        +retirar(valor: float) void*
    }
    
    class CuentaCorriente {
        - sobregiro: float
        +CuentaCorriente(saldo: float, tasaanual: float, sobregiro: float)
        +retirar(valor: float) void*
    }
    
    Cuenta <|-- CuentaAhorros
    Cuenta <|-- CuentaCorriente
    
    note "Clase base para todas las cuentas bancarias"
        class Cuenta
    end
    
    note "Requiere saldo mínimo de 10,000\npara estar activa"
        class CuentaAhorros
    end
    
    note "Permite girar más allá del saldo\nhasta el límite de sobregiro"
        class CuentaCorriente
    end
```

## Descripción

- **Cuenta**: Clase base que define las operaciones bancarias básicas (consignaciones, retiros, cálculo de intereses)
- **CuentaAhorros**: Hereda de Cuenta con validación de saldo mínimo de 10,000
- **CuentaCorriente**: Hereda de Cuenta con soporte para sobregiro

