def call(String name, String status) {
    def template = libraryResource('templates/email.txt')
    def message = template.replace('${name}', name).replace('${status}', status)
    echo message
}
