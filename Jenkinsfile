
node {
    checkout scm
    triggers {cron('H/10 * * * *')}
    bat 'mvn test'
}