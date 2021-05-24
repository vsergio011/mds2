import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

class VistaEncargadocabecera extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; justify-content: space-between; border:solid;">
 <img style="margin: var(--lumo-space-m); width: 70px; height: 70px;" src="https://image.freepik.com/free-vector/online-shopping-logo-design-template_130382-9.jpg">
 <vaadin-button id="principalBtn" style="align-self: center;">
  Inicio
 </vaadin-button>
 <vaadin-horizontal-layout theme="spacing" style="margin: var(--lumo-space-xs); padding: var(--lumo-space-m); align-self: center;">
  <vaadin-button theme="primary" id="btnMensajes">
    Mensajes 
  </vaadin-button>
  <vaadin-button theme="primary" id="btnCerraSesion">
    Cerrar Sesión 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-encargadocabecera';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaEncargadocabecera.is, VistaEncargadocabecera);
