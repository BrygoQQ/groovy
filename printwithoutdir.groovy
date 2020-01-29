import groovy.io.*

def listfiles(dir) {
	flist = []
	new File(dir).eachFile(FileType.FILES, {flist << it.name })
	flist.sort()
	return flist.flatten()
}

fs = listfiles(".")
fs.each {
	println it
}