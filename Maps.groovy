def people = [
    person1: [
        name: "Sumana",
        age: 30,
        city: "New York"
    ],
    person2: [
        name: "Datta",
        age: 25,
        city: "Los Angeles"
    ],
    person3: [
        name: "Karthik",
        age: 35,
        city: "Chicago"
    ]
]

def sumana = people.person1
def datta = people['person2']
def karthik = people.get('person3')

sumana.email = "sumana@example.com"
datta.email = "datta@example.com"
karthik.email = "karthik@example.com"

people.person2.remove('city')

def hasSumanaEmail = sumana.containsKey('email')
def hasDattaEmail = datta.containsKey('email')
def hasKarthikEmail = karthik.containsKey('email')

def peopleSize = people.size()

def isPeopleEmpty = people.isEmpty()

println "People: $people"
println "Sumana: $sumana"
println "Datta: $datta"
println "Karthik: $karthik"
println "Does Sumana have email? $hasSumanaEmail"
println "Does Datta have email? $hasDattaEmail"
println "Does Karthik have email? $hasKarthikEmail"
println "Size of the people map: $peopleSize"
println "Is the people map empty? $isPeopleEmpty"
