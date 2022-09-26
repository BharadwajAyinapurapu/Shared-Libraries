def ping(String pathOfKey, String hosts){
  sh "ansible ${hosts} -m ping --key-file ${pathOfKey}"
}

def playbook-execution(String pathOfKey, String playbook){
  sh "ansible-playbook --key-file ${pathOfKey} ${playbook}"
}
