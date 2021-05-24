import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaTransportistalistadopedidos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: flex-end;">
 <vaadin-horizontal-layout theme="spacing" style="width: 100%; height: 20%; flex-grow: 0; flex-shrink: 0;">
  <img style="width: 50%; height: 100%;" src="data:image/jpeg;base64,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">
  <vaadin-button theme="primary" style="width: 50%; height: 50%; margin: var(--lumo-space-s);" id="btnExit">
   Exit
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 95%; height: 95%; align-self: center; align-items: center; justify-content: center; background-color:grey; margin: var(--lumo-space-s); padding: var(--lumo-space-s);">
  <vaadin-text-field placeholder="Search" id="inputBusqueda" style="background-color:white">
   <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
  </vaadin-text-field>
  <vaadin-vertical-layout theme="spacing" id="containerPedido" style="align-self: center; width: 80%; height: 90%;background-color:white"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-transportistalistadopedidos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaTransportistalistadopedidos.is, VistaTransportistalistadopedidos);
