* docker -> build image -> run container -> organized as pods (which act as a separate machine) on a worker node -> exposed via services (static IP)
* declarative
* job - task that terminates after completion
* ingress - one IP, operate on HTTP layer, multiple services
    * The client first performed a DNS lookup of kubia.example.com, and the DNS server (or the local operating system) returned the IP of the Ingress controller. The client then sent an HTTP request to the Ingress controller and specified kubia.example.com in the Host header. From that header, the controller determined which service the client is trying to access, looked up the pod IPs through the End- points object associated with the service, and forwarded the client’s request to one of the pods.
* TLS - via secrets
* volume types: emptyDir, gitRepo, hostPath, persistent disks
* sidecar containers, augment operation of main container in the pod
* configuration via env vars, config maps
* exec vs shell (unnecessary) form
