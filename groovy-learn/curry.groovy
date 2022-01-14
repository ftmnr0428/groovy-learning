def log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

log("DEBUG",new Date(), "This is my first debug statement...")

def debugLog = log.curry("DEBUG")
debugLog(new Date(), "This is my another debug..")
debugLog(new Date(), "This is my one more debug..")

