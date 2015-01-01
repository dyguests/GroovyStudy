class Resource {
    def open() { println "opened..." }

    def close() { println "closed..." }

    def read() { println "read..." }

    def write() { println "write..." }

    def static use(closure) {
        def r = new Resource()
        try {
            r.open()
            closure(r)
        } finally {
            r.close()
        }
    }
}

Resource.use {
    it.read()
    it.write()
}