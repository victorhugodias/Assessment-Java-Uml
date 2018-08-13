# Projeto da faculdade Infnet utilizando Java para avaliar as competências dos alunos.  
#### Descrição do Sistema.

Sua organização desenvolverá um sistema de controle institucional em uma instituição de ensino, o SISACAD, e você será o responsável pelo desenvolvimento de um protótipo mínimo viável.

O sistema será utilizado por professores, alunos e funcionários administrativos. Veja a definição das classes abaixo. Os campos em negrito são obrigatórios para instanciar o objeto:

| Aluno     | Professor    | Administrativo |
| --------|---------|-------|
| nome (string)  | nome (string)   |  nome (string)   |
| cpf (string) | cpf (string) | cpf (string)  |
| matricula (string) | matricula (string) | matricula (string) |
| cursos (lista de Curso) | cursos (lista de Curso) |     |
|  | salario (double) | salario (double)  |


1. O salário de professores e funcionários não pode ser menor do que zero. Deve ser disparada uma exceção SalarioInvalidoException em cenários onde houver tentativa de atribuir salário negativo. Crie esta classe de exceção.
2. O salário de professor é um double calculado como o montante do total de horas de seus cursos vezes o valor da hora-aula, que deve valer 50.
3. O salário de funcionário administrativo é um double.
4. Também deverá ser criada a classe Curso, que só precisa de nome (string) e duração em horas (int).
5. Todas as classes devem implementar a interface Comparable, comparando os itens por nome, colocando-os na ordem alfabética.
6. Todas as classes devem possuir o método toString, da classe Object, que imprime todos os dados do objeto: nome, cpf e matricula para qualquer tipo de pessoa, cursos para alunos, cursos e salario para professores e salario para administrativos.
7. Tenha em mente que uma pessoa do sistema precisa ser Aluno, Professor ou Administrativo. Elas devem ser subclasses de uma classe Pessoa, que não admite instanciação. Pessoa não deve possuir um construtor padrão.
8. Aplique os conceitos de herança e polimorfismo, dado que será possível consultar uma pessoa (seja aluno, professor ou funcionário) buscando pela matrícula no sistema.
