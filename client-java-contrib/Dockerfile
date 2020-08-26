FROM docker:stable

# install git, bash, kind, kubectl and clone the kubernetes-client/gen code base
RUN apk add --no-cache git bash && \
    wget -O /usr/bin/kind https://kind.sigs.k8s.io/dl/v0.8.1/kind-linux-amd64 && \
    chmod +x /usr/bin/kind && \
    wget -O /usr/bin/kubectl https://storage.googleapis.com/kubernetes-release/release/v1.18.0/bin/linux/amd64/kubectl && \
    chmod +x /usr/bin/kubectl && \
    git clone https://github.com/kubernetes-client/gen.git

COPY generate.sh generate.sh
RUN chmod +x generate.sh

WORKDIR gen/openapi

CMD ["/generate.sh"]