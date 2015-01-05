class Worker {
    def work() { println 'get work gone' }

    def analyze() { println 'analyze...' }

    def writeReport() { println 'get report written' }
}

class Expert {
    def analyze() { println 'expert analysis...' }
}

class Manager {
    @Delegate
    Expert expert = new Expert()
    @Delegate
    Worker worker = new Worker()
}

def bernie = new Manager()
bernie.analyze()
bernie.work()
bernie.writeReport()