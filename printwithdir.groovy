import groovy.io.*

def listfiles(dir) {
	dlist = []
	flist = []
	new File(dir).eachDir {dlist << it.name }
	dlist.sort()
	new File(dir).eachFile(FileType.FILES, {flist << it.name })
	flist.sort()
	return (dlist << flist).flatten()
}

fs = listfiles(".")
fs.each {
	println it
}