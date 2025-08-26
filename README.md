# java-BCrypt-examples

Os Algoritmos de BCrypt utilizam do Algoritmo de One Way, significa que teremos apenas 1 caminho de Ida, e nenhum de volta, segue abaixo um modelo do hash gerado pelas bibliotecas de BCrypt.

![BCrypt hash image](https://i.sstatic.net/m8opZ.png)

Vale ressaltar que o custo padrão da maioria das bibliotecas é 10.

# Bibliotecas Utilizadas

Abaixo segue as biliotecas e suas respectivas dependências maven.

___ 
## Favre BCrypt Lib

```
<dependency>
  <groupId>at.favre.lib</groupId>
  <artifactId>bcrypt</artifactId>
  <version>0.10.2</version>
</dependency>
```

___ 
## Mindrot BCrypt Lib

```
<dependency>
  <groupId>org.mindrot</groupId>
  <artifactId>jbcrypt</artifactId>
  <version>0.4</version>
</dependency>
```

___ 
## Spring Security BCrypt

```
<dependency>
  <groupId>org.springframework.security</groupId>
  <artifactId>spring-security-crypto</artifactId>
  <version>7.0.0-M2</version>
</dependency>
```
