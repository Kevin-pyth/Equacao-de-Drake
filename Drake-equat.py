#   A equação de Drake é um cálculo bastante hipotético.
#

print ("\n\nA equação de Drake etipula a quantidade provável de civilizações na nossa galáxia conforme as informações atuais. \n\n")

R0 = float (input(" Informe a taxa de formação das estrelas da galáxia:\n "))
Fp = float (input(" Informe a quantidade dessas estrelas que têm planetas:\n"))
Ne = float (input(" Informe o número médio de planetas com potencial de desenvolver vida:\n"))
Fl = float (input(" Número provável de planetas que realmente desenvolvem vida:\n"))
Fi = float (input(" Fração provável de planetas que desenvolve vida inteligente:\n"))
Fc = float (input(" Fração provável de planetas com vida inteligente com capacidade de comunicação:\n"))
L  = float (input(" Tempo provável de vida de uma civilização:\n"))

N = R0 * Fp * Ne * Fl * Fi * Fc * L

print (" A resposta atual é:",N)