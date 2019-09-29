Pet of the day returns a flash briefing feed formatted for Alexa.


## Setup

 Create a new EC2 instance

### Install JDK, mvn, git

    '''sudo yum install java-1.8.0-openjdk
    sudo yum install maven
    sudo yum install git
    git clone https://git-codecommit.us-east-1.amazonaws.com/v1/repos/PetOfTheDay
    git config user.name "Wonder Woman"'''

###  Redirect port 8080 to 80 
   Using port 80 seems to be  an undocumented requirement for Alexa flash briefing skills
    'sudo iptables -A PREROUTING -t nat -i eth0 -p tcp --dport 80 -j REDIRECT --to-port 8080'

### Build  
    'mvn clean install'

### Run
    'java -jar target/petOfTheDay-0.1.0.jar'  

### That's it!  
You can access your feed at http://<<your ec2 instance>>.amazonaws.com/pet
