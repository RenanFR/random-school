## Recursos utilizados no projeto

**Biblioteca mapstruct**

Tem o propósito de eliminar a necessidade de digitar código repetitivo para mapeamento de DTOs

Gera automaticamente com base em uma interface na pasta target uma implementação do mapeamento com base na assinatura dos métodos definidos para o mapeamento, bem como as anotações de customização

- Exemplo

```
@Mapper(componentModel = "spring")
public interface StudentMapper {
	
	Student entityToRecord(StudentEntity student);

}
```

**Liquibase**

Ferramenta para migração de banco de dados, permite evoluir a estrutura da base de maneira controlada e rastreável por meio de scripts denominados changelogs

O comando abaixo gera uma primeira versão do changelog com base em uma base de dados existente

```sh
mvn liquibase:generateChangeLog
```

Ele utiliza o plugin configurado no pom que por sua vez referencia o properties que contém a localização e credenciais do banco de dados a ser utilizado