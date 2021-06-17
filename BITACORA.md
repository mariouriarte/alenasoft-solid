# SISTEMA GILDED ROSE

## Smell Code identificados:
- Anidación de IFs para la lógica de negocio.
- La lógica de negocios está en un solo archivo. Primera regla de SOLIR no respetada
- Si bien se tiene una Clase Item, esta no se está utilizando adecuadamente.
- Las propiedades de la clase Item son públicas, deberían modificarse a privates y usarse los métodos getters y setters. (No se está encapsulando)
- Para manejar objetos es mejor utilizar estructura de datos como HasgMaps. y no utilizar las listas directamente.
- Es mejor iterar los objetos en las listas de la manera shell: for (Item item : items)

## Cambios Realizados
- Se creó una rama llamada refactor_items
- Se separó los tipos de Items para ser implementadas con Quality.
- updateQuality hara el trabajo, no importa como cada item lo haga, pero tiene que administrar la Quality.
- Se creó un Factory Method para los objetos de tipo Qualitable.
- Se separó la lógica de "updateQualityItem" y de "decrementSellInItem"

