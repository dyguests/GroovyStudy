process="wc".execute()

process.out.withWriter{
    it<<"Let the World know... \n"
    it<<"Groovy Rocks!\n"
}

println process.in.text
//println process.text

