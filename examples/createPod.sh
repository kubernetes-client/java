#creates a pod and runs Example.java(list pods for all namespaces) on starting of pod
export REPO_ROOT=$(pwd)/../

cd ${REPO_ROOT}/kubernetes
mvn install

cd ${REPO_ROOT}/examples
mvn package
eval $(minikube docker-env)
docker build -t test/examples:1.0 .
kubectl apply -f test.yaml
