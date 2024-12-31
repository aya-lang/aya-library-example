# Aya Java Library Example

## How to use

You can either download the jar from the releases page or build the library yourself (see below)

Then in aya, use the `:(library.load)` operator to load the jar. Make sure to use the correct path to where you have the jar saved

`:(library.load)` will return a list of loaded operators. In this case, there are 2.

```
aya> "target/aya-library-example-1.0-SNAPSHOT.jar" :(library.load)
[ ":(example.instruction)" ":(example.instruction2)" ]
aya> :(example.instruction)
"hello, world"
aya> :(example.instruction2)
"foo bar"
aya> 
```

## Building

### Install Aya

To build, first install [Aya](https://github.com/aya-lang/aya/). To install, clone the repo, then from inside the aya dir, run `mvn install`

```
git clone https://github.com/aya-lang/aya.git
cd aya
mvn install
```

### Build

To build this library, run the package command

```
mvn package
```

## Adding more Instructions

A jar can provide one or more `NamedInstructionStore` implementations.  
This is done by adding the fully qualified class name(s) to this file:
`META-INF/services/aya.instruction.named.NamedInstructionStore`

For more information, you should look up 'Java SPI' (Service Provider Interface).

## Contributors

  - @BlazingTwist
  - @nick-paul
