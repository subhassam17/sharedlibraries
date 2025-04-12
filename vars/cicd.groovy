def gitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}

def buildartifact()
{
  sh 'mvn package'
}  
