  m@declarations = {*model@declarations | model <- models};
  m@uses = {*model@uses | model <- models};
  m@containment = {*model@containment | model <- models};
  m@documentation = {*model@documentation | model <- models};
  m@modifiers = {*model@modifiers | model <- models};
  m@messages = [*model@messages | model <- models];
  m@names = {*model@names | model <- models};
  m@types = {*model@types | model <- models};

  m@extends = {*model@extends | model <- models};
  m@implements = {*model@implements | model <- models};
  m@methodInvocation = {*model@methodInvocation | model <- models};
  m@fieldAccess = {*model@fieldAccess | model <- models};
  m@typeDependency = {*model@typeDependency | model <- models};
  m@methodOverrides = {*model@methodOverrides | model <- models};