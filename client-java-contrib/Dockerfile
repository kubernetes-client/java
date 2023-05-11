FROM docker:stable

# install git, bash, kind, kubectl and clone the kubernetes-client/gen code base
RUN apk add --no-cache git bash && \
    wget -O /usr/bin/kind https://kind.sigs.k8s.io/dl/v0.11.1/kind-linux-amd64 && \
    chmod +x /usr/bin/kind && \
    wget -O /usr/bin/kubectl https://dl.k8s.io/release/v1.26.4/bin/linux/amd64/kubectl && \
    chmod +x /usr/bin/kubectl && \
    git clone https://github.com/kubernetes-client/gen.git && \
    cd gen && \
    git checkout 729332ad08f0f4d98983b7beb027e2f657236ef9
    # 729332ad08f0f4d98983b7beb027e2f657236ef9 is the last commit using python2 interpreter


COPY Dockerfile.gen gen/openapi/openapi-generator/Dockerfile
COPY generate.sh generate.sh

RUN chmod +x generate.sh

WORKDIR gen/openapi

CMD ["/generate.sh"]